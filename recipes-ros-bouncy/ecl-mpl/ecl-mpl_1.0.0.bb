# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metaprogramming tools move alot of runtime calculations to be shifted to     compile time. This has only very elementary structures at this stage."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_mpl/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e86eba77f21a41a20410c0635182edcb"
SRC_URI[sha256sum] = "b488d5f11f460f0803c99258946ebc704a75028581c4c155e6de019b705e0ea5"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_mpl-1.0.0-0"

inherit ros
inherit ament


