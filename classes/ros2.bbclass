# ros2.bbclass

inherit ros_common

# Place metadata unique to ROS 2 here.

# https://index.ros.org/doc/ros2/Installation/Linux-Development-Setup/#id3 says LANG must be in the environment. Allow it to be
# overridden in local.conf .
export LANG ??= "en_US.UTF-8"

do_install_append() {
    rm -rf ${D}${datadir}/${ROS_BPN}/environment
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.bash
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.sh
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.zsh
    rm -f ${D}${prefix}/local_setup.bash
    rm -f ${D}${prefix}/local_setup.sh
    rm -f ${D}${prefix}/local_setup.zsh
    rm -f ${D}${prefix}/setup.bash
    rm -f ${D}${prefix}/setup.sh
    rm -f ${D}${prefix}/setup.zsh
    rm -f ${D}${prefix}/_order_packages.py
}

FILES_${PN} = " \
    ${datadir}/${ROS_BPN}/package.xml \
    ${datadir}/${ROS_BPN}/resource \
    ${datadir}/${ROS_BPN}/msg \
    ${datadir}/${ROS_BPN}/srv \
    ${datadir}/${ROS_BPN}/launch \
    ${datadir}/ament_index \
    ${libdir}/${PYTHON_DIR} \
    ${libdir}/${ROS_BPN} \
    ${libdir}/lib*.so.* \
    ${bindir} \
"

FILES_${PN}-dev = " \
    ${datadir}/${ROS_BPN}/cmake \
    ${includedir} \
"
