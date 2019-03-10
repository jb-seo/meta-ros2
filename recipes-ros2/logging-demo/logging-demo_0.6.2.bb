# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples for using and configuring loggers."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake ament-index-cpp class-loader rclcpp rcutils rosidl-cmake rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/logging_demo/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "14d9627829914114a08ae9ea2e876a4a"
SRC_URI[sha256sum] = "7486e3acfc247d398ac0aaa8a89cec089c9dca1e9f2a542221c3cc894faa658c"
S = "${WORKDIR}/demos-release-release-crystal-logging_demo-0.6.2-0"

inherit catkin
