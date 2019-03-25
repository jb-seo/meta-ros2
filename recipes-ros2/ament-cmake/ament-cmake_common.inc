# ROSDISTRO-cache.yaml has <build_type> as ament_cmake -- huh?
ROS_BUILD_TYPE = "cmake"

BBCLASSEXTEND = "native"

inherit python3native

do_install_append() {
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.bash
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.sh
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.zsh
}

FILES_${PN}_append = " \
    ${datadir}/${ROS_BPN} \
    ${datadir}/ament_index \
"