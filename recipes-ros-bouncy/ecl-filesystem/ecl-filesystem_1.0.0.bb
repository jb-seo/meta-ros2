# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Cross platform filesystem utilities (until c++11 makes its way in)."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_filesystem/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6c60c465024cde52d3360fc18f91b776"
SRC_URI[sha256sum] = "492dfca4b75e71fccab93e2d2a20993a96af7475fb115e65c576514fc2c80512"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_filesystem-1.0.0-0"

inherit ros
inherit ament


