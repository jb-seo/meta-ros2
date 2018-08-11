# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing a C-based lifecycle implementation"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-ros lifecycle-msgs rcl rcutils rmw-implementation rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/bouncy/rcl_lifecycle/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ae6e020bbe2c9ab0ff2205e56d893718"
SRC_URI[sha256sum] = "37eac532ca248e4b0788c7c7af471d450c4115b361650b85ca3e39e9ad4d3084"
S = "${WORKDIR}/rcl-release-release-bouncy-rcl_lifecycle-0.5.1-0"

inherit catkin
