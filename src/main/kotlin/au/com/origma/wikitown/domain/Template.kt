package au.com.origma.wikitown.domain

interface Template {
    val type: TemplateType
}

enum class TemplateType {
    TEXT, INFOBOX
}

data class TextTemplate(
    val value: String
): Template {
    override val type = TemplateType.TEXT
}