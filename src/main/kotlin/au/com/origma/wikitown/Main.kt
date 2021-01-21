package au.com.origma.wikitown

import au.com.origma.wikitown.domain.*
import au.com.origma.wikitown.output.DocumentGenerator
import java.lang.Exception

class Main {

    companion object {

        val documentGenerator = DocumentGenerator()

        @JvmStatic
        fun main(args: Array<String>) {
            val doc = WikiDocument(
                Infobox(
                    "Australian place",
                    mapOf(
                        "type" to TextTemplate("town"),
                        "coord" to CoordTemplate(100.0, 100.0, "title"),
                        "link" to LinkTemplate("test", "test")
                    )
                ),
                "Test",
                listOf(
                    Section(
                        "Test Section",
                        "Test Content",
                        listOf(
                            Section(
                                "Sub",
                                "Sub",
                                null
                            )
                        )
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