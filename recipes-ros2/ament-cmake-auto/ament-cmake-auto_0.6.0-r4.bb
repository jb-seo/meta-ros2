# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The auto-magic functions for ease to use of the ament buildsystem in CMake."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_auto/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c5131e31e42d4475fb098273c23bc6ff"
SRC_URI[sha256sum] = "c5b3378d7d8ca88a34401b80f7618ad78fa339ad707ccaf31fe3953f48f858e5"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_auto-0.6.0-4"

inherit catkin
