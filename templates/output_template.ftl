<#macro output obj>
<#switch obj.type>
    <#case "TEXT">
        ${obj.value}
        <#break>
    <#case "INFOBOX">
        <#import "generic_infobox.ftl" as info />
        <@info.infobox infobox=obj />
        <#break>
    <#case "COORD">
        <#import "wtemplates/coord.ftl" as c />
        <@c.coord coord=obj />
        <#break>
    <#default>
        ${obj}
</#switch>
</#macro>