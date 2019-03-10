# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a signal/slot mechanism (in the same vein as qt sigslots,      boost::signals etc for intra-process communication. These include      some improvements - they do not need a preprocessor, are fully type safe,      allow for simple connections via a posix style string identifier      and are multithread-safe."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-config ecl-license ecl-threads"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_sigslots/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7809eed89b7d4bca2533bc4dd8938a64"
SRC_URI[sha256sum] = "9f2f83fc23240e78693cb56a7abf2cb87b2bea9efbe6a9107299e0dd574db611"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_sigslots-1.0.1-0"

inherit catkin
