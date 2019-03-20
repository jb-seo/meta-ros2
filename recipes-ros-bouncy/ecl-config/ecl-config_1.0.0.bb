# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These tools inspect and describe your system with macros, types      and functions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/bouncy/ecl_config/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a9aa3c5982ea0a56463d1392a2dc4150"
SRC_URI[sha256sum] = "4fe91955bfe56878cc7bed6e16bd7a579c7988c4410002f7d59a978cb0d1679a"
S = "${WORKDIR}/ecl_lite-release-release-bouncy-ecl_config-1.0.0-0"


inherit ros
inherit ament

