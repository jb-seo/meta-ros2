# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a portable set of time functions that are especially useful for      porting other code or being wrapped by higher level c++ classes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/bouncy/ecl_time_lite/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0f4117eba499e6899856a1ffb1f48d0e"
SRC_URI[sha256sum] = "482458bad8bb76aae2d56611aab169e01f3205def69625a2f9488a772b23443a"
S = "${WORKDIR}/ecl_lite-release-release-bouncy-ecl_time_lite-1.0.0-0"


inherit ros
inherit ament

