# From v1 example-interfaces_git.bb
FILES_${PN}_append = " ${datadir}/${ROS_BPN}/mapping_rules.yaml"

DEPENDS += " rosidl-typesupport-c rosidl-typesupport-cpp"
