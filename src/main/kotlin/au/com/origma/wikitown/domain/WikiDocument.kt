package au.com.origma.wikitown.domain

interface ContentHolder {
    val content: String
}

data class Section(
    val title: String,
    override val content: String,
    val subsections: List<Section>?
): ContentHolder

data class WikiDocument(
    val infobox: String?,
    override val content: String,
    val sections: List<Section>
): ContentHolder