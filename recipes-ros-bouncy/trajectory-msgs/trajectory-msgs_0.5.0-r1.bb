# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some robot trajectory message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/trajectory_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a17aeb829552280f37ba932a47d95ef7"
SRC_URI[sha256sum] = "8db091f6c018ac55024de9c7eaa1f547caa579a855d16de0d8be6ccc4b1cc06f"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-trajectory_msgs-0.5.0-1"

inherit catkin
