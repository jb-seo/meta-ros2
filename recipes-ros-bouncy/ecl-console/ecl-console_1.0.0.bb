# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Color codes for ansii consoles."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/bouncy/ecl_console/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cfaf24ffafa1d3c39952dcf0d9a2e5b1"
SRC_URI[sha256sum] = "63e11aa8a8898082f2fc06c14e264620760014e7d5da08926fcb90f465d14716"
S = "${WORKDIR}/ecl_lite-release-release-bouncy-ecl_console-1.0.0-0"

inherit ros
inherit ament


