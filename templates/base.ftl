<#import "section.ftl" as sec />
<#import "generic_infobox.ftl" as info />
{{Use Australian English|date=${monthName} ${year}}}
{{Use dmy dates|date=${monthName} ${year}}}
<#if document.infobox?? >
<@info.infobox infobox=document.infobox />
</#if>
${document.content}

<#list document.sections as section>
<@sec.section level=2 section=section/>
</#list>

==References==
{{Reflist}}