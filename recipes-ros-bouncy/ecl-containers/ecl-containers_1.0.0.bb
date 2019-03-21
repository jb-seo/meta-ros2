# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The containers included here are intended to extend the stl containers.     In all cases, these implementations are designed to implement     c++ conveniences and safety where speed is not sacrificed.      Also includes techniques for memory debugging of common problems such     as buffer overruns."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-converters ecl-errors ecl-exceptions ecl-formatters ecl-license ecl-mpl ecl-type-traits ecl-utilities"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_containers/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cce9e30a508426666172b8773fde83f4"
SRC_URI[sha256sum] = "decf64dad46f8e7d1808c852f8c16f9a93f01a0e560b38c1f635a0cd375025f4"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_containers-1.0.0-0"

inherit ros
inherit ament


