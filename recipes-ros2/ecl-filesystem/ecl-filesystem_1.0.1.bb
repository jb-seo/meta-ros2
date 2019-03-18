# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Cross platform filesystem utilities (until c++11 makes its way in)."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-build ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_filesystem/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d98c59080c8077e2177766d91f6da324"
SRC_URI[sha256sum] = "9b6fd490434d4a1a8f44f974f4f01ebfd5b6a2bef880fca7586b41d811a8aabc"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_filesystem-1.0.1-0"

inherit ament
