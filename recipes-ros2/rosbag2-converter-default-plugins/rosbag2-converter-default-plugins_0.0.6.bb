# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing default plugins for format converters"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake ament-index-cpp pluginlib poco-vendor rcutils rmw rosbag2 rosidl-generator-cpp"
SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/rosbag2_converter_default_plugins/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2a3f70cc1f4178b3dbf829278c7d9abe"
SRC_URI[sha256sum] = "3c031aeb23cff5bdc3f298698fcaee9dc24d27455557a9c15c892e19a658cb77"
S = "${WORKDIR}/rosbag2-release-release-crystal-rosbag2_converter_default_plugins-0.0.6-0"

inherit catkin
