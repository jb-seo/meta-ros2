# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common statistical structures and algorithms for control systems."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-license ecl-linear-algebra ecl-mpl ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_statistics/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c6b7be8def85080b039858550e93c3fd"
SRC_URI[sha256sum] = "4798c5526b55194c6df69eb84f3c87b69f8c411f2f78a2eb722bf782a7ae0f1c"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_statistics-1.0.0-0"

inherit ros
inherit ament


