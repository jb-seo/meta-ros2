# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some robot trajectory message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/crystal/trajectory_msgs/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de1b6741345ebefdf907aa132473f401"
SRC_URI[sha256sum] = "9080e638daee2e5f3fb97a72dc991f24b28b7833d2d330cba35e1bcf16d171bd"
S = "${WORKDIR}/common_interfaces-release-release-crystal-trajectory_msgs-0.6.1-0"

inherit catkin
