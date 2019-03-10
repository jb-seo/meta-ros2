# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Layer encapsulating ROS middleware to allow rosbag2 to be used with or without middleware"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-ros rclcpp rmw rosbag2 shared-queues-vendor"
SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/rosbag2_transport/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ffe7973cbf64b324a659fae4e57938c1"
SRC_URI[sha256sum] = "9100e0456d00e7bd47889ddc2984636aef3ca27de5729fea7efd24b8fd353264"
S = "${WORKDIR}/rosbag2-release-release-crystal-rosbag2_transport-0.0.6-0"

inherit catkin
