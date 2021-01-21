<#macro coord coord>
{{Coord | ${coord.lat} | ${coord.lng} <#if coord.display??> | display = ${coord.display} </#if> }}</#macro>