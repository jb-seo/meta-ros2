# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ implementation of Lie Groups using Eigen."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "cmake eigen"
SRC_URI = "https://github.com/yujinrobot-release/${PN}-release/archive/release/bouncy/${PN}/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c5c272478b10c919569d44b9c62ce5e4"
SRC_URI[sha256sum] = "a29074bc4fcfb6f1becebcfab6146a37b75d0a3479d846c808b3b2fa1585804e"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-1.0.2-0"


inherit ros
inherit cmake

