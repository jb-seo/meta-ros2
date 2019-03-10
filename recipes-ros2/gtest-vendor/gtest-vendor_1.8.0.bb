# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The package provides GoogleTest."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/googletest-release/archive/release/crystal/gtest_vendor/1.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "86206b25fe018f1952cdf765d09732ef"
SRC_URI[sha256sum] = "f670a11cca4cf323c27c007c363ae1cdedcab5b04894fe9fb427075855c25854"
S = "${WORKDIR}/googletest-release-release-crystal-gtest_vendor-1.8.0-0"

inherit catkin
