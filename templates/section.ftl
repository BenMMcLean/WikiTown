<#macro section level sec>
<#list 0..<level as i>=</#list>${sec.title}<#list 0..<level as i>=</#list>
${sec.content}
<#if sec.subsections?? >
    <#list sec.subsections as subsection>
        <@section level=level+1 sec=subsection />
    </#list>
</#if>
</#macro>