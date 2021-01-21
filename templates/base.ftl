<#import "section.ftl" as sec />
{{Use Australian English|date=${monthName} ${year}}}
{{Use dmy dates|date=${monthName} ${year}}}
<#if document.infobox?? >
${document.infobox}
</#if>
${document.content}

<#list document.sections as section>
<@sec.section level=2 section=section/>
</#list>

==References==
{{Reflist}}