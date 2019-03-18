# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a set of simple math utilities to work         with angles. The utilities cover simple things like         normalizing an angle and conversion between degrees and         radians. But even if you're trying to calculate things like         the shortest angular distance between two joint space         positions of your robot, but the joint motion is constrained         by joint limits, this package is what you need. The code in         this package is stable and well tested. There are no plans for         major changes in the near future."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/1.12.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "07c6472d38bf25ad517b1ea6cff4297d"
SRC_URI[sha256sum] = "e3c90023c90d9597d863351a77b147dc86aabf26c6ea2d44cbd5e8bf2c69ebb0"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-1.12.1-1"

inherit ament
