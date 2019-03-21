# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ headers for URDF."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "console-bridge cmake libtinyxml"
SRC_URI = "https://github.com/ros2-gbp/urdfdom_headers-release/archive/release/bouncy/urdfdom_headers/1.0.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "18ff2c28eef8e4b745db60eb7eb757b7"
SRC_URI[sha256sum] = "f73d7d6513c556b5afcb2817c63f3d0b0b97b114ee188fe74eee112ae4502a81"
S = "${WORKDIR}/urdfdom_headers-release-release-bouncy-urdfdom_headers-1.0.0-1"

inherit ros
inherit cmake


