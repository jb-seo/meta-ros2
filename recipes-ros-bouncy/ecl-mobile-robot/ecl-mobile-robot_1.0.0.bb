# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains transforms (e.g. differential drive inverse kinematics)     for the various types of mobile robot platforms."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-errors ecl-formatters ecl-geometry ecl-license ecl-linear-algebra ecl-math"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_mobile_robot/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "05d1da29c1f6b0ba09da4811ace4da6a"
SRC_URI[sha256sum] = "f5bc40e55312202066a4b912ba422520caeeb1cca8cd481cb37e4714f8e16a5c"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_mobile_robot-1.0.0-0"

inherit ros
inherit ament


