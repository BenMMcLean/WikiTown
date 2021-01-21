<#macro output obj>
<#switch obj.type>
    <#case "TEXT">
        ${obj.value}
        <#break>
    <#default>
        ${obj}
</#switch>
</#macro>