BBCLASSEXTEND = "native"

PACKAGES_append = " ${PN}-completion"
FILES_${PN}-completion_append = " ${datadir}/ament_tools/environment"