# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Includes various supporting tools and utilities for c++ programming."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-concepts ecl-license ecl-mpl"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_utilities/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "00edc9cc7f1d7e6cb88f8983b8b87761"
SRC_URI[sha256sum] = "af7d65009d28d51c55e22fd258c5305649294e5ab13179bf808813d458681a0d"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_utilities-1.0.0-0"


inherit ros
inherit ament

