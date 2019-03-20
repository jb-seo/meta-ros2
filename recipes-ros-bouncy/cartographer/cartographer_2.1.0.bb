# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Cartographer is a system that provides real-time simultaneous localization     and mapping (SLAM) in 2D and 3D across multiple platforms and sensor     configurations."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"

DEPENDS = "boost cmake eigen g++-static libcairo2-dev libceres-dev libgflags-dev libgoogle-glog-dev lua5.2-dev protobuf-dev"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d8fa858f1a1cd6009d51e8b0565eb4e2"
SRC_URI[sha256sum] = "51d1a1d834147212a900c4ed2ea2333e4a318278d74776939aa0b7de1edf370c"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-2.1.0-0"


inherit ros
inherit cmake

