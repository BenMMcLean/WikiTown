package au.com.origma.wikitown.output

import au.com.origma.wikitown.domain.WikiDocument
import freemarker.template.Configuration
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.OutputStreamWriter
import java.nio.charset.StandardCharsets
import java.text.SimpleDateFormat
import java.util.*

class DocumentGenerator(
    private val time: Long = System.currentTimeMillis()
) {

    private var config: Configuration = Configuration(Configuration.VERSION_2_3_29).apply {
        setDirectoryForTemplateLoading(File("templates/"))
    }

    fun generate(document: WikiDocument): String {
        val data = hashMapOf(
            "document" to document,
            "monthName" to getMonthName(),
            "year" to getYear()
        )

        val template = config.getTemplate("base.ftl")

        val outputStream = ByteArrayOutputStream()
        val outputWriter = OutputStreamWriter(outputStream)
        template.process(data, outputWriter)

        return String(outputStream.toByteArray(), StandardCharsets.UTF_8)
    }

    private fun getMonthName(): String {
        return SimpleDateFormat("MMMM").format(Date(time))
    }

    private fun getYear(): String {
        return SimpleDateFormat("YYYY").format(Date(time))
    }

}