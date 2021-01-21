<#macro section level section>
<#list 0..<level as i>=</#list>${section.title}<#list 0..<level as i>=</#list>
${section.content}
<#if section.subsections?? >
    <#list section.subsections as subsection>
        <@section level=level+1 section=subsection />
    </#list>
</#if>
</#macro>