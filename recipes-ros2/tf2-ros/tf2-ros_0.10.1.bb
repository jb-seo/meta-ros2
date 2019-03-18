# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the ROS bindings for the tf2 library, for both Python and C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " geometry-msgs message-filters rclcpp std-msgs tf2 tf2-msgs"
SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/crystal/tf2_ros/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7bfb782c8c3ab1d78b329df5a55fc14f"
SRC_URI[sha256sum] = "9ce43d432da28490f5420df35d2adcc2486455dd97dac648d209a85d86ffc34c"
S = "${WORKDIR}/geometry2-release-release-crystal-tf2_ros-0.10.1-0"

inherit ament
