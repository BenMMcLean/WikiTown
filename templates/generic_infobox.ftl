<#import "output_template.ftl" as out>
<#macro infobox infobox>
{{Infobox ${infobox.type}
<#list infobox.values?keys as key>
| ${key} = <@out.output infobox.values[key] />
</#list>
}}
</#macro>