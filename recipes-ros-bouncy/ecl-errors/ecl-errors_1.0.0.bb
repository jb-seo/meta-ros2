# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This library provides lean and mean error mechanisms.     It includes c style error functions as well as a few     useful macros. For higher level mechanisms,     refer to ecl_exceptions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/bouncy/ecl_errors/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5fb4d62bcfc23cb5eed3ea2d4d7b10cc"
SRC_URI[sha256sum] = "a73c189bc9da171ede61b5792d687a69ef7720e31e391e21e177c3f5f96e139f"
S = "${WORKDIR}/ecl_lite-release-release-bouncy-ecl_errors-1.0.0-0"


inherit ros
inherit ament

