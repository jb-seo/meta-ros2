# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple node to convert a depth image and camera info into a PointCloud2."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake image-geometry rclcpp sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/turtlebot2_demo-release/archive/release/bouncy/depthimage_to_pointcloud2/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "873d87e41961940026dc2838497d7167"
SRC_URI[sha256sum] = "0e27a91ddf111e56aea0ddf86196fd1f2947ecf62a0615cfe87ebe8396206e2f"
S = "${WORKDIR}/turtlebot2_demo-release-release-bouncy-depthimage_to_pointcloud2-0.5.1-0"

inherit catkin
