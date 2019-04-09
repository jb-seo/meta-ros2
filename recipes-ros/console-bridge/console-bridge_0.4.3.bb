DESCRIPTION = "console_bridge is a ROS-independent, pure CMake package that provides logging \
calls that mirror those found in rosconsole, but for applications that are not necessarily using \
ROS."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "\
    file://include/console_bridge/console.h;beginline=1;endline=33;md5=279eed49072cc9f6ebe38974afcc4803 \
    file://src/console.cpp;beginline=1;endline=33;md5=279eed49072cc9f6ebe38974afcc4803 \
"

DEPENDS = "boost"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7c2e11c4342f453bd42527bb4593dcfb"
SRC_URI[sha256sum] = "9f024a38f0947ed9fa67f58829980c2d90d84740e6de20d75cb00866f07a7a0b"

S = "${WORKDIR}/${ROS_SP}"

inherit cmake catkin_opt_ros

# For some reason, the cmake subdir is under ${libdir} instead of ${datadir} for this component.
FILES_${PN}-dev += "${libdir}/${ROS_BPN}/cmake"
