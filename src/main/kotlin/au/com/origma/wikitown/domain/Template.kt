package au.com.origma.wikitown.domain

interface Template {
    val type: TemplateType
}

enum class TemplateType {
    TEXT, INFOBOX, COORD, LINK
}

data class TextTemplate(
    val value: String
): Template {
    override val type = TemplateType.TEXT
}

data class CoordTemplate(
    val lat: Double,
    val lng: Double,
    val display: String? = null
): Template {
    override val type = TemplateType.COORD
}

data class LinkTemplate(
    val link: String,
    val title: String? = null
): Template {
    override val type = TemplateType.LINK
}