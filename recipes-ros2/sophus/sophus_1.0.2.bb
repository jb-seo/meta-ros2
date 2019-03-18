# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ implementation of Lie Groups using Eigen."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "cmake eigen"
SRC_URI = "https://github.com/yujinrobot-release/${PN}-release/archive/release/crystal/${PN}/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b35e8cb2a638c846d1258f10a13ee3f3"
SRC_URI[sha256sum] = "bf2d15f293ed5fc5710b76bf6be309ddee55b910a37f34cc259b69bce11ef6f2"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-1.0.2-0"

inherit ament
