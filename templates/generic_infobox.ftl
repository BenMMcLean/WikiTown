<#import "output_template.ftl" as out>
<#macro infobox infobox>
{{Infobox ${infobox.infoboxType}
<#list infobox.values?keys as key>
| ${key} = <@out.output infobox.values[key] />
</#list>
}}
</#macro>