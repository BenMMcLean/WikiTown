<#macro output obj>
<#switch obj.type>
    <#case "TEXT">
        ${obj.value}
        <#break>
    <#case "INFOBOX">
        <#import "generic_infobox.ftl" as info />
        <@info.infobox infobox=obj />
        <#break>
    <#default>
        ${obj}
</#switch>
</#macro>