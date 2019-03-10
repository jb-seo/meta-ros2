# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing a C-based ROS action implementation"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "action-msgs ament-cmake-ros rcl rcutils rmw rosidl-generator-c"
SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/crystal/rcl_action/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3795c9480fef3588918150ed194a1437"
SRC_URI[sha256sum] = "310cce8bd98e77096504509809de7d9d19b270025052ff0eb14d88a61b9e700c"
S = "${WORKDIR}/rcl-release-release-crystal-rcl_action-0.6.5-0"

inherit catkin
