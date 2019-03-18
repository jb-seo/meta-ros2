# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ types and functions shared by the ROS middleware interface to RTI Connext Static and RTI Connext Dynamic."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " connext-cmake-module rcutils rmw rosidl-cmake"
SRC_URI = "https://github.com/ros2-gbp/rmw_connext-release/archive/release/crystal/rmw_connext_shared_cpp/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a628641a20fd6818b7577978b12f6b17"
SRC_URI[sha256sum] = "7c45059558c31cf04c5130b14d5df11dedac4f01991d29cec84c4d95784a120b"
S = "${WORKDIR}/rmw_connext-release-release-crystal-rmw_connext_shared_cpp-0.6.1-0"

inherit ament
