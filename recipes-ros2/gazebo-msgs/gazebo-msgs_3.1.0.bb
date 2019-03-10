# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message and service data structures for interacting with Gazebo from ROS2."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs trajectory-msgs"
SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/crystal/gazebo_msgs/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f97e587c9f110f2f2f12ac8d0b393ea0"
SRC_URI[sha256sum] = "99255310dc1d10ace9de040cbd5e4005999d857d7dcdaa5316d416e69734834f"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-crystal-gazebo_msgs-3.1.0-0"

inherit catkin
