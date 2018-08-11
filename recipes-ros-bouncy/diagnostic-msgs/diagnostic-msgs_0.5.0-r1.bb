# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some diagnostics related message and service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/diagnostic_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b7b46e5b8aafc672760861f605eb5b05"
SRC_URI[sha256sum] = "4db5f2f7cc89d82155e0051e5c3e252949f3d7c80845731346551991e6d0e96b"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-diagnostic_msgs-0.5.0-1"

inherit catkin
