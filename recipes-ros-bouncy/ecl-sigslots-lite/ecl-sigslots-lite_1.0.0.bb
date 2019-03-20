# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This avoids use of dynamic storage (malloc/new) and thread safety (mutexes) to      provide a very simple sigslots implementation that can be used for *very*      embedded development."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/bouncy/ecl_sigslots_lite/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a8d0958f28e5f4de2bf7f0cc09e18180"
SRC_URI[sha256sum] = "de0f31d7352f6443c7a6b4422f065489e2d01335997b4b605bbb3f5096b0323a"
S = "${WORKDIR}/ecl_lite-release-release-bouncy-ecl_sigslots_lite-1.0.0-0"


inherit ros
inherit ament

