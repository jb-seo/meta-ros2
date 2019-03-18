# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This avoids use of dynamic storage (malloc/new) and thread safety (mutexes) to      provide a very simple sigslots implementation that can be used for *very*      embedded development."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " ecl-build ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/crystal/ecl_sigslots_lite/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d6dff414f0ce0e679e2504577ac421e"
SRC_URI[sha256sum] = "e9103435c3befa6c163051a944ca2964b5761d2db5697a288be95cc82aa6a423"
S = "${WORKDIR}/ecl_lite-release-release-crystal-ecl_sigslots_lite-1.0.1-0"

inherit ament
