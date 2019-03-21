# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These are lightweight text streaming classes that connect to standardised      ecl type devices."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-concepts ecl-converters ecl-devices ecl-errors ecl-license ecl-time ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_streams/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "09c07c6b35bf3cfe61b2f68638f77665"
SRC_URI[sha256sum] = "71d9a872775f8fac9097fc73a8b1e936315bf8c025c9ef22627b9a04ce1f07d9"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_streams-1.0.0-0"

inherit ros
inherit ament


