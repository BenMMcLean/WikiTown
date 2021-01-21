package au.com.origma.wikitown

import au.com.origma.wikitown.domain.Section
import au.com.origma.wikitown.domain.WikiDocument
import au.com.origma.wikitown.output.DocumentGenerator
import java.lang.Exception

class Main {

    companion object {

        val documentGenerator = DocumentGenerator()

        @JvmStatic
        fun main(args: Array<String>) {
            val doc = WikiDocument(
                null,
                "Test",
                listOf(
                    Section(
                        "Test Section",
                        "Test Content",
                        null
                    )
                )
            )
            try {
                System.out.println(documentGenerator.generate(doc))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

    }

}