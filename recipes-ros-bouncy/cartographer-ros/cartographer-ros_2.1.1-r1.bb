# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Cartographer is a system that provides real-time simultaneous localization     and mapping (SLAM) in 2D and 3D across multiple platforms and sensor     configurations. This package provides Cartographer's ROS integration."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"

DEPENDS = "cartographer cartographer-ros-msgs console-bridge nav-msgs pcl-conversions rclcpp sensor-msgs tf2 tf2-eigen tf2-msgs tf2-ros urdf urdfdom-headers visualization-msgs eigen libpcl-all-dev lua5.2-dev yaml-cpp"
SRC_URI = "https://github.com/ros2-gbp/cartographer_ros-release/archive/release/bouncy/cartographer_ros/2.1.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9f8e7d05aff4e7f62905bcec29d719b8"
SRC_URI[sha256sum] = "da9a2272b74e22831ea49a8bd77b16097a18111f6d0eb5b47d71aa897b7b127c"
S = "${WORKDIR}/cartographer_ros-release-release-bouncy-cartographer_ros-2.1.1-1"

inherit ros
inherit ament


